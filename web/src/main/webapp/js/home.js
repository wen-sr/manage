/**
 * Description:
 * User: wen-sr
 * Date: 2017-09-03  17:38
 */
$(function(){
    checkUserLogin();

    $('#loginOut').click(function () {
        $.messager.confirm('系统提示', '您确定要退出本次登录吗?', function (r) {
            if (r) {
                logout(function(){
                    window.location.href = "../login.html";
                },function(){})
            }
        });
    });
})

function checkUserLogin(){
    _util.loadUserInfo(function(res){
        $(".username").text(res.user.name);
        InitLeftMenu(res.menuList);
    },function(erro){
        window.location.href = "../login.html";
    })
}

function initMenu(data){

}

function logout(resolve, reject){
    _util.request({
        url : _util.getServerUrl("/user/logout"),
        method : "post",
        success : resolve,
        error   : reject
    })
}
