package modules

object ModuleLoader {
    fun loadModules() {
        val httpModule = HttpModule.create()
        ServiceModule.create(httpModule.gameClient)
    }
}