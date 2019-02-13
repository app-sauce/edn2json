# edn2json

The simplest way to convert [EDN](https://github.com/edn-format/edn) to
[JSON](https://www.json.org/).

This project is very small and has one goal: to be the pipeline between EDN and
[jq](https://stedolan.github.io/jq/).

After looking far and wide for a quick converter, we decided to build our own
using Clojure.

# Installation

Download the latest [release from Github](https://github.com/app-sauce/edn2json/releases).

# Usage

Put `edn2json` in your shell pipeline between EDN and JQ:

```
cat big.edn | edn2json | jq .
```

# Building

This will create a new binary (`target/edn2json`):

```
clojure -A:native-image
```

# License

Copyright © 2018 App Sauce LLC

Distributed under the Eclipse Public License either version 1.0 or (at your
option) any later version.
