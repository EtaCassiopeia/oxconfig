# OxConfig

OxConfig is a dynamic configuration library for Scala. It allows you to update your configuration without restarting your application. It is based on [PureConfig](https://pureconfig.github.io/).

OxConfig supports different backends including Consul, Etcd, Zookeeper and Vault. It also supports local file configuration.

OxConfig is implemented as a wrapper around PureConfig. It uses PureConfig to load configuration from a file and then updates the configuration once it is changed in the backend. 

The updated configuration is propagated to the config keys through Channels, which is implemented using the [Ox](https://github.com/softwaremill/ox/) library

## Installation

## Usage
