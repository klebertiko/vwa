/**
 * Created by kleber on 14/12/16.
 */
vwa.controller('helloController', function($scope, $http) {

    $http.get('/getOla')
        .then(function (response) {
            $scope.mensagemRetorno = response.data;
        });

    $scope.enviarScript = function enviarScript() {
        $scope.mensagemRetorno = $scope.textoEnvio;
    }

    $scope.postOla = function postOla() {
        if($scope.textoEnvio == "" || $scope.textoEnvio == undefined) {
            alert("Digite seu nome!");
        } else {
            $http.post('/postOla', $scope.textoEnvio)
                .then(function (response) {
                    $scope.mensagemRetorno = response.data;
                });
        }
    }

    $scope.criaArquivo = function criaArquivo() {
        if($scope.textoEnvio == "" || $scope.textoEnvio == undefined) {
            alert("Digite seu nome!");
        } else {
            $http.post('/criarArquivo', $scope.textoEnvio)
                .then(function (response) {
                    $scope.mensagemRetorno = response.data;
                });
        }
    }

    $scope.executarComando = function executarComando() {
        if($scope.textoEnvio == "" || $scope.textoEnvio == undefined) {
            alert("Digite um comando linux");
        } else {
            $http.post('/executarComando', $scope.textoEnvio)
                .then(function (response) {
                    $scope.mensagemRetorno = response.data;
                });
        }
    }
});
