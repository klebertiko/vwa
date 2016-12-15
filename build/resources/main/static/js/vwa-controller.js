/**
 * Created by kleber on 14/12/16.
 */
vwa.controller('helloController', function($scope, $http) {

    $http.get('/getOla')
        .then(function (response) {
            $scope.mensagem = response.data;
        });

    $scope.postOla = function postOla() {
        if($scope.nome == "" || $scope.nome == undefined) {
            alert("Digite seu nome!");
        } else {
            $http.post('/postOla', $scope.nome)
                .then(function (response) {
                    $scope.mensagem = response.data;
                });
        }
    }
});
