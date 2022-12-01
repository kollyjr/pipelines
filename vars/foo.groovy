def call(final body) {
  def config = [:]
  config["bar"] = "bar was called"
  body.delegate = config
  body()
}
