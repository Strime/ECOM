/**
 * Created by Sandeep on 01/06/14.
 */
angular.module('glisseAngular.controllers',[]).controller('TestController',['$scope','Test',function($scope,Test){
    Test.plop(1).then(function(data) {    
        t = data.data;
        debugger;
        $scope.movies=[{title:t}];
    });
    

    $scope.deleteMovie=function(){
        
    }

}]);