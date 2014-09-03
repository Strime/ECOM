angular.module('glisseAngular.services',['ngResource']).factory('Test',['$resource','$http',function($resource,$http){
    return {
        plop : function(_id) {return $http({
                url : '/GlisseShop-war/webresources/generic/getJson',
                method: "POST",
                params : {id: _id}
            });
        }
    
    }
}]);