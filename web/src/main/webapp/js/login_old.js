/**
 * Description:
 * User: wen-sr
 * Date: 2017-09-03  15:46
 */

$(function () {
    //得到焦点
    $("#password").focus(function () {
        $("#left_hand").animate({
            left: "150",
            top: " -38"
        }, {
            step: function () {
                if (parseInt($("#left_hand").css("left")) > 140) {
                    $("#left_hand").attr("class", "left_hand");
                }
            }
        }, 2000);
        $("#right_hand").animate({
            right: "-64",
            top: "-38px"
        }, {
            step: function () {
                if (parseInt($("#right_hand").css("right")) > -70) {
                    $("#right_hand").attr("class", "right_hand");
                }
            }
        }, 2000);
    });
    //失去焦点
    $("#password").blur(function () {
        $("#left_hand").attr("class", "initial_left_hand");
        $("#left_hand").attr("style", "left:100px;top:-12px;");
        $("#right_hand").attr("class", "initial_right_hand");
        $("#right_hand").attr("style", "right:-112px;top:-12px");
    });
    //点击按钮登录
    $("#login").click(function(){
        login();
    });
    //在工号框按下回车
    $("#id").keyup(function(e){
        if(e.keyCode === 13){
            $("#password").focus();
        }
    })
    //在密码框按下回车
    $("#password").keyup(function(e){
        if(e.keyCode === 13){
            login();
        }
    })
});


function login(){
    var formData = {
        id : $.trim($("#id").val()),
        pwd : $.trim($("#password").val())
    }
    var validateResult = formValidate(formData);
    if(validateResult.status){
        formError.hide();
        submit(formData, function(res){
            window.location.href = './home.html';
        },function (errMsg) {
            formError.show(errMsg);
        })
    }else{
        formError.show(validateResult.msg);
    }



}

// 表单字段的验证
function formValidate (formData){
    var result = {
        status  : false,
        msg     : ''
    };
    if(!_util.validate(formData.id, 'require')){
        result.msg = '工号不能为空';
        return result;
    }
    if(!_util.validate(formData.pwd, 'require')){
        result.msg = '密码不能为空';
        return result;
    }
    // 通过验证，返回正确提示
    result.status   = true;
    result.msg      = '验证通过';
    return result;
}

// 表单里的错误提示
var formError = {
    show : function(errMsg){
        $('.error-msg').show().html(errMsg);
    },
    hide : function(){
        $('.error-msg').hide().text('');
    }
};

//submit
function submit (formData, resolve, reject ){
    _util.request({
        url     : _util.getServerUrl('/user/login'),
        data    : formData,
        method  : 'POST',
        success : resolve,
        error   : reject
    })
}