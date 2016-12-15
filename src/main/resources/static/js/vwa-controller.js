/**
 * Created by kleber on 14/12/16.
 */
vwa.controller('helloController', function($scope, $http) {

    /*$http.get('/getOla')
        .then(function (response) {
            $scope.mensagem = response.data;
        });*/

    $scope.postOla = function postOla() {
        if($scope.nomeUsuario == "" || $scope.nomeUsuario == undefined) {
            alert("Digite seu nome!");
        } else {
            $scope.mensagem = "Olá ";
            $scope.nome = $scope.nomeUsuario;

            /*$http.post('/postOla', $scope.nomeUsuario)
                .then(function (response) {
                    $scope.mensagem = response.data;
                });*/
        }
    }
});
