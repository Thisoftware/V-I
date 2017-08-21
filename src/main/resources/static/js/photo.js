$imagejs={
    image : function () {
        layer.confirm('Do you love me?', {
            btn: ['Yes','No'] //按钮
        }, function(){
            layer.msg('I love you too,baby ! ! !', {icon: 6});
        }, function(){
            layer.confirm('Why So cruel?', {
                btn: ['I was wrong.', 'This’s it.']
        }, function (){
                layer.msg('You scared me, baby...', {icon: 6});
        }, function (){
                window.location.href="/logout";
            });
        });
    }
}