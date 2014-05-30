var getversion = {
    get:function(successCbf,errorCbf){
        cordova.exec(successCbf, errorCbf,"GetVersionPlugin","get",[]);
    }
}
module.exports = getversion;
