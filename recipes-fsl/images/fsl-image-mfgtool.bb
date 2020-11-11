# Copyright (C) 2015 Freescale Semiconductor

require recipes-core/images/core-image-minimal.bb

SUMMARY = "Small image commonly used for manufacturing or other small image needs."
DESCRIPTION = "Small image which only includes essential manufacturing \
packages to deploy other big images to large physical media, such as \
a USB stick or a hard drive."

LICENSE = "MIT"

IMAGE_INSTALL_append = " \
    packagegroup-core-ssh-dropbear \
    packagegroup-fsl-mfgtools \
    udev-extraconf \
    file \
    parted \
    lmsensors-sensors \
    restool \
    fmc \
    sudo \ 
    curl \
"
IMAGE_INSTALL_remove_ls1021atwr = "restool"

export IMAGE_BASENAME = "fsl-image-mfgtool"

IMAGE_ROOTFS_EXTRA_SPACE = "262144"
IMAGE_FSTYPES += "ext4.gz"
