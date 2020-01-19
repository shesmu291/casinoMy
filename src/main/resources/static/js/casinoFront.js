// function test() {
//
//     $.ajax({
//         url: '/api/casino/get?id=1',
//         type: 'get',
//         contentType: 'application/json; charset=utf-8',
//         dataType: 'json',
//         success: function (film) {
//             console.log(film);
//             alert("title:" + film.title);
//             alert('success');
//         },
//         error: function (response) {
//             alert('error');
//         }
//     });
//
//
// }

// function saveData() {
//     var email = $("#email").val();
//     var moneyWon =  $("#moneyWon").val();
//     var moneyLost = $("#moneyLost").val();
//     var money = $("#money").val();
//
//     var newFilm= {
//         'email' : email,
//         'moneyWon' : moneyWon,
//         'moneyLost' : moneyLost,
//         'money' : money
//     };
//     $.ajax({
//         method: "post",
//         url: "/api/casino/add",
//         contentType: 'application/json; charset=utf-8',
//         data: JSON.stringify(newFilm),
//         success: function () {
//             window.location.replace("/allFilm")
//         },
//         error: function (error) {
//
//         }
//     });
// //
// $(document).ready(function () {
//     $.ajax({
//         url: '/api/casino/casino',
//         type: 'get',
//         contentType: 'application/json; charset=utf-8',
//         dataType: 'json',
//         success: function (user) {
//             console.log(user);
//             for (var i = 0; i < user.length; i++) {
//                 $("#forAdd").before(
//                     "<tr>" +
//                     "<td>" + user[i].money + "</td>" +
//                     "<td>" +
//                     "            <a class=\"btn btn-primary\" href=\"/film/editFilm?id=" + films[i].id + "\"  >Редактировать</a>" +
//                     "            <a class=\"btn btn-danger\" href=\"/film/deleteFilm?id=" + films[i].id + "\"  >Удалить</a>" +
//                     "        </td>" +
//                     "</tr>")
//             }
//
//         },
//         error: function (response) {
//             alert('error');
//         }
//     });
//
//
// });