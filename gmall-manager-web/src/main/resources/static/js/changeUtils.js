serializeObject = function(form) {
    var o = {};
    $.each(form.serializeArray(), function(index) {
        if (o[this['name']]) {
            o[this['name']] = o[this['name']] + this['value'];
        } else {
            o[this['name']] = this['value'];
        }
    });
    return o;
};

/**
 * 扩展的关于编辑状态的 对要输入日期的控件使用
 */
$.extend($.fn.datagrid.defaults.editors, {
    datetimebox : {
        init : function(container, options) {
            var editor = $('<input />').appendTo(container);
            options.editable = false;
            editor.datetimebox(options);
            return editor;
        },
        getValue : function(target) {
            return $(target).datetimebox('getValue');
        },
        setValue : function(target, value) {
            $(target).datetimebox('setValue', value);
        },
        resize : function(target, width) {
            $(target).datetimebox('resize', width);
        },
        destroy : function(target) {
            $(target).datetimebox('destroy');
        },
    }
});

/**
 * 动态的选择处于修改状态的行中的某些列是否可编辑
 */
$.extend($.fn.datagrid.methods, {
    addEditor : function(jq, param) {
        if (param instanceof Array) {
            $.each(param, function(index, item) {
                var e = $(jq).datagrid('getColumnOption', item.field);
                e.editor = item.editor;
            });
        } else {
            var e = $(jq).datagrid('getColumnOption', param.field);
            e.editor = param.editor;
        }
    },
    removeEditor : function(jq, param) {
        if (param instanceof Array) {
            $.each(param, function(index, item) {
                var e = $(jq).datagrid('getColumnOption', item);
                e.editor = {};
            });
        } else {
            var e = $(jq).datagrid('getColumnOption', param);
            e.editor = {};
        }
    }
});
/**
 * 扩展用于将后台传入的长整型的表示时间的数值转换成 "2014-01-07 16:45:45" 格式
 */
Date.prototype.format = function(format) {
    if (isNaN(this.getMonth())) {
        return '';
    }
    if (!format) {
        format = "yyyy-MM-dd hh:mm:ss";
    }
    var o = {
        "M+" : this.getMonth() + 1,
        "d+" : this.getDate(),
        "h+" : this.getHours(),
        "m+" : this.getMinutes(),
        "s+" : this.getSeconds(),
        "q+" : Math.floor((this.getMonth() + 3)/3),
        "S"	: this.getMilliseconds(),
    };
    if(/(y+)/.test(format)){
        format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    }
    for(var k in o){
        if(new RegExp("("+k+")").test(format)){
            format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substring(("", o[k]).length));
        }
    }
};
formatTime = function(form) {
    return new Date(form).format();
};

/**
 * 更换主题
 */
changeTheme = function(type){
    var $easyuiTheme = $('#easyuiTheme');
    var url = $easyuiTheme.attr('href');
    console.info(url);
    var href = url.substring(0, url.indexOf('easyui'))+ 'easyui/' + type + '/easyui.css';
    console.info(href);
    $easyuiTheme.attr('href',href);

    /* 如果使用了iframe  则要添加下面这段代码、否则的话iframe中的内容不会出现样式的改变
    var $iframe = $('iframe');
    if($ifram.length > 0){
        for ( var i = 0; i < $iframe.length; i++) {
            var ifr = $iframe[i];
            $(ifr).contents.find('#easyuiTheme').attr('href', href);

        }
    }
    */
    $.cookie('easyuiThemeName', type, {
        expires : 7
    });
};