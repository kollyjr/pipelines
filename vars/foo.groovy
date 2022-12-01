def call(final Map params, final body) {
	def key = 'BAR'
	if (params.get('variable') != null) {
		key = params.get('variable')
	}  	

  	def config = [:]
  	config[key] = "bar was called"
  	body.delegate = config
  	body()
}
