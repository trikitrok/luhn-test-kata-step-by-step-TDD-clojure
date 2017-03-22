### Luhn test

Taken from https://gist.github.com/trikitrok/bf931a3d0cb360c45b6b10358cae05a4

## How to run the tests

The project uses [Midje](https://github.com/marick/Midje/).

The project uses [Midje](https://github.com/marick/Midje/).

## How to run the tests

`lein midje` will run all tests.

`lein midje namespace.*` will run only tests beginning with "namespace.".

`lein midje :autotest` will run all the tests indefinitely. It sets up a
watcher on the code files. If they change, only the relevant tests will be
run again.
