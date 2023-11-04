pipeline {
  agent any
   parameters {
    editableChoice(
      name: 'TAGS',
      choices: ['', 'WP-*', 'smoke', 'rfb', 'orders', 'routes', 'moda', 'flaky', 'brokers'],
      defaultValue: '',
    )
  }
  stages {
    stage('Healthchecks') {
      parallel {
        stage('Healthcheck 1') {
          steps {
            echo 'Healthcheck 1'
          }
        }

        stage('Healthcheck 2') {
          steps {
            echo 'Healthcheck 2'
          }
        }

        stage('Healthcheck 3') {
          steps {
            echo 'Healthcheck 3'
          }
        }

      }
    }

    stage('Features') {
      parallel {
        stage('Feature 1') {
          steps {
            echo 'Feature 1'
          }
        }

        stage('Feature 2') {
          steps {
            echo 'Feature 2'
          }
        }

        stage('Feature 3') {
          steps {
            echo 'Feature 3'
          }
        }

        stage('Feature 4') {
          steps {
            echo 'Feature 4'
          }
        }

        stage('Feature 5') {
          steps {
            echo 'Feature 5'
          }
        }

        stage('Feature 6') {
          steps {
            echo 'Feature 6'
          }
        }

      }
    }

    stage('Ready For Business') {
      parallel {
        stage('Ready For Business 1') {
          steps {
            echo 'Ready For Business 1'
          }
        }

        stage('Ready For Business 2') {
          steps {
            echo 'Ready For Business 2'
          }
        }

        stage('Ready For Business 3') {
          steps {
            echo 'Ready For Business 3'
          }
        }

      }
    }

  }
}
