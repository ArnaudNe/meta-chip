DESCRIPTION = "CHIP image minimal, to get the hardware running with WiFi and Bluetooth Smart"
LICENSE = "MIT"

require chip-image-minimal.bb

IMAGE_INSTALL += " \
	chip-packagegroup-wifi \
	networkmanager \
	"

IMAGE_INSTALL += " \
	bluez5 \
	packagegroup-tools-bluetooth \
	"
