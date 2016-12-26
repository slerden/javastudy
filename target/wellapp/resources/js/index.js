/**
 * Created by Oleg on 26.12.2016.
 */
function getData() {
    $.ajax({
        type : 'GET',
        url : '/wellapp/getData',
        success:function (result) {
                alert(result);
        }
    })
}