set -e
javac -cp .:lib/hamcrest-core-1.3.jar.:lib/junit-4.13.2.jar DocSearchServer.java DocSearchTest.java
javac -cp .:lib/hamcrest-core-1.3.jar.:lib/junit-4.13.2.jar org.junit.runner.JUitCore TestNumberServer