DESCRIPTION = "CHIP image minimal, to get the hardware running"
LICENSE = "MIT"

require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += " \
    kernel-image \
    kernel-modules \
    kernel-devicetree \
    "
