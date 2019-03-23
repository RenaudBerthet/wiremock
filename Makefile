start-wm:
	docker run --rm --name wiremock -p 15421:8080 rodolpheche/wiremock:2.22.0-alpine --verbose
stop-wm:
	docker stop wiremock