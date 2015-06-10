var exec = require('cordova/exec');

var UmengAutoUpdatePlugin = function () {
};

UmengAutoUpdatePlugin.prototype.update = function() {
	exec(null, null, "UmengAutoUpdatePlugin", "update", []);
};

/*
UmengAutoUpdatePlugin.prototype.setDeltaUpdate = function(deltaUpdate) {
	exec(null, null, "UmengAutoUpdatePlugin", "setDeltaUpdate", [deltaUpdate]);
}
*/

if (!window.plugins) {
    window.plugins = {};
}

if (!window.plugins.umengAutoUpdatePlugin) {
    window.plugins.umengAutoUpdatePlugin = new UmengAutoUpdatePlugin();
}

module.exports = new UmengAutoUpdatePlugin();
