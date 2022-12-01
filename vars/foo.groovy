def call(final body) {
  def key = 'BAR'
  def config = [:]
  config[key] = "bar was called"
  body.delegate = config
  body()
}
