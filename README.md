# resol-vbus-java

A Java library for processing RESOL VBus data.


## Features

- Connects to various RESOL devices
- Processes live VBus data streams
- Discovers LAN-enabled RESOL devices on the local network
- Allows to send parameterization commands to a controller


## Documentation

TBD



## Supported Devices & Services

* [All current RESOL controllers with VBus](http://www.resol.de/index/produkte/sprache/en)
* [RESOL DL2 Datalogger](http://www.resol.de/index/produktdetail/kategorie/2/sprache/en/id/12)
* [RESOL DL3 Datalogger](http://www.resol.de/index/produktdetail/kategorie/2/sprache/en/id/86)
* [RESOL VBus/LAN interface adapter](http://www.resol.de/index/produktdetail/kategorie/2/id/76/sprache/en)
* [RESOL VBus.net](http://www.vbus.net/)



## <a name="specs"></a>Technical Information & Specifications

* [RESOL VBus Google Group](https://groups.google.com/forum/#!forum/resol-vbus)
* [RESOL VBus Protocol Specification](https://drive.google.com/file/d/0B4wMTuLGRPi2RnU0Vm1tTG5wM1k/edit?usp=sharing)
* [RESOL VBus Packet List](http://danielwippermann.github.io/resol-vbus/vbus-packets.html)
* [RESOL VBus over TCP Specification](http://danielwippermann.github.io/resol-vbus/vbus-over-tcp.html)



## Changelog

### 0.5.0 (2020-09-27)

- Add `StreamConnection` class.
- Add example using serial port.


### 0.4.0 (2020-09-08)

- Prepare for release into central Maven repo
    - Fix tests and documentation


### 0.3.0 (2019-01-16)

- Replace Apache Commons `Hex` class with minimal stub.
- Fix bugs in `getValueIdByIdHash` and `getValueIdHashById`.
- Copy listeners to prevent `ConcurrentModificationException`.
- Add an example that uses two `EmDeviceEmulator` instances.
- Rename `Em1DeviceEmulator` to `EmDeviceEmulator`.
- Add `Em1DeviceEmulator` and tests.
- Change `BaseDeviceEmulator#update` to return preferred sleep time.
- Add `BaseDeviceEmulator` class and tests.
- Add documentation to `LittleEndianBuffer`.
- Add `TestablePropertyChangeListener`.
- Add `TestableConnection` class.
- Add `LittleEndianBuffer` and tests.
- Add `aggregator` example.


### 0.2.0 (2018-03-24)

- Add `SpecificationFile.getLanguageForLocale`.
- Update VSF file to version 9 / 20180312.
- fix off-by one in forged boolean-like-enums
- Change `convertToDate` to use `long` instead of `double`.
- Add `PacketFieldValue#getRawValueDate()` method.
- Add `Formatter#convertToDate()`.
- Add `PacketFieldValue#isBooleanLikeEnum()`.
- Forge enum for boolean-like errors.
- Add `PacketFieldSpec#getEnum()`.
- Revert changes in constructor of `PacketFieldSpec`.
- Fix bug that caused the locale to be ignored for dates.
- Add `Enum` and `EnumVariant` support to `Specification`.
- Add `Enum` and `EnumVariant` support to `SpecificationFile`.
- Add access to all know units.
- Fix reading whole specification file.
- Fix VBusLAN adapter device info parsing bug.


### 0.1.0 (2017-12-28)

- Add support for VSF (VBus Specification File).
- Adapt to recent change from `___.via.vbus.net` to `___.vbus.io`.
- Some bug fixes.


### 0.0.1

Initial release



## Legal Notices

RESOL, VBus, VBus.net and others are trademarks or registered trademarks
of RESOL - Elektronische Regelungen GmbH.

All other trademarks are the property of their respective owners.



## License

Copyright (C) 2008-2016, RESOL - Elektronische Regelungen GmbH.

Copyright (C) 2016-2018, Daniel Wippermann.

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to permit
persons to whom the Software is furnished to do so, subject to the
following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
DEALINGS IN THE SOFTWARE.
