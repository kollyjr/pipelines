def call(final body) {
  def config = [:]
  config["bar"] = "bar"
  body.delegate = config
  body()
}
