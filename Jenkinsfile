pipeline {
    agent any
    parameters {
        string description: 'Only run feature files matching regular expression PATTERN.', name: '--include', trim: true
        string description: 'Don’t run feature files matching regular expression PATTERN.', name: '--exclude', trim: true
        string description: 'Only execute the feature elements which match part of the given name. If this option is given more than once, it will match against all the given names.', name: '--name', trim: true
        booleanParam description: 'Only run scenarios tagged with “wip”. Additionally: use the “plain” formatter, do not capture stdout or logging output and stop at the first failure.', name: '--wip'
        editableChoice(
                name: '--tags (editableChoice plugin)',
                choices: [null, 'WP-*', 'smoke', 'rfb', 'orders', 'routes', 'moda', 'flaky', 'brokers'],
                defaultValue: null,
                description: 'Only execute features or scenarios with tags matching TAG_EXPRESSION.',
                filterConfig: filterConfig(caseInsensitive: true),
        )
        activeChoice(
                choiceType: 'PT_CHECKBOX',
                description: 'Select tags to run',
                filterLength: 1,
                filterable: true,
                name: 'tags (activeChoice plugin) - Check Boxes',
                randomName: 'choice-parameter-6390411988460',
                script: groovyScript(
                        fallbackScript: [
                                classpath: [],
                                oldScript: '',
                                sandbox  : false,
                                script   : ''
                        ],
                        script: [
                                classpath: [],
                                oldScript: '',
                                sandbox  : false,
                                script   : '''
                                    return[
                                        \'WP-*\',
                                        \'smoke\',
                                        \'rfb\',
                                        \'orders\',
                                        \'routes\',
                                        \'moda\',
                                        \'flaky\',
                                        \'brokers\'
                                        ]'''
                        ]
                )
        )
        activeChoice(choiceType: 'PT_CHECKBOX', description: 'Select feature files to run', filterLength: 1, filterable: false, name: 'feature files (activeChoice plugin)', randomName: 'choice-parameter-8519215871878', script: groovyScript(fallbackScript: [classpath: [], oldScript: '', sandbox: false, script: ''], script: [classpath: [], oldScript: '', sandbox: false, script: '''return[
\'feature/\',
\'feature/orders\',
\'feature/orders/create.feature\',
\'feature/orders/delete.feature\',
\'feature/orders/modify.feature\',
\'feature/orders/reassign.feature\',
\'feature/routes\',
\'feature/routes/create.feature\',
\'feature/routes/delete.feature\',
]''']))
        activeChoice choiceType: 'PT_SINGLE_SELECT', description: 'Select which features to run in the specified directory', filterLength: 1, filterable: false, name: 'Directory', randomName: 'choice-parameter-9272078881017', script: groovyScript(fallbackScript: [classpath: [], oldScript: '', sandbox: false, script: ''], script: [classpath: [], oldScript: '', sandbox: false, script: 'return [\'orders\', \'routes\', \'baskets\']'])
        reactiveChoice choiceType: 'PT_CHECKBOX', filterLength: 1, filterable: false, name: 'feature files (activeChoice plugin - Reactive Parameter)', randomName: 'choice-parameter-9272073471051', referencedParameters: 'Directory', script: groovyScript(fallbackScript: [classpath: [], oldScript: '', sandbox: false, script: 'return ["Script Error"]'], script: [classpath: [], oldScript: '', sandbox: false, script: '''if (Directory.equals("orders")) {
    return ["create_order.feature", "delete_order.feature", "modify_order.feature"]
} else if (Directory.equals("routes")) {
    return ["create_route.feature", "delete_route.feature"]
} else if (Directory.equals("baskets")) {
    return ["create_basket.feature", "delete_basket.feature", "aggregate_basket.feature", "rename_basket.feature"]
} else {
    return ["Unknown Feature"]
}'''])
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
