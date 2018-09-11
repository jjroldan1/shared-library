#!/usr/bin/env groovy

def logDefault() {
  echo "Calling default"
}

def logWithName(String name = 'undefined') {
  echo "Hello, ${name}"
}
