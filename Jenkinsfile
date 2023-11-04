pipeline {
  agent any
   parameters {
    string description: 'Only run feature files matching regular expression PATTERN.', name: '--include', trim: true
    string description: 'Don’t run feature files matching regular expression PATTERN.', name: '--exclude', trim: true
    string description: 'Only execute the feature elements which match part of the given name. If this option is given more than once, it will match against all the given names.', name: '--name', trim: true
    booleanParam description: 'Only run scenarios tagged with “wip”. Additionally: use the “plain” formatter, do not capture stdout or logging output and stop at the first failure.', name: '--wip'
    editableChoice(
      name: '--tags',
      choices: [null, 'WP-*', 'smoke', 'rfb', 'orders', 'routes', 'moda', 'flaky', 'brokers'],
      defaultValue: null,
      description: 'Only execute features or scenarios with tags matching TAG_EXPRESSION.',
      filterConfig: filterConfig(caseInsensitive: true),
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
