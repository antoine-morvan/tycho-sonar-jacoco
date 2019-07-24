# tycho-sonar-jacoco

This works for me and shows 100% coverage in 4 tests in SonarQube:

	$ mvn clean install
	$ mvn jacoco:report -Djacoco.dataFile=../../target/jacoco.exec
	$ mvn sonar:sonar