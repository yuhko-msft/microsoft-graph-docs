---
title: "deviceOperatingSystemSummary resource type"
description: "Device operating system summary."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceOperatingSystemSummary resource type

Namespace: microsoft.graph



Device operating system summary.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|androidCorporateWorkProfileCount|Int32|The count of Corporate work profile Android devices. Also known as Corporate Owned Personally Enabled (COPE). Valid values -1 to 2147483647|
|androidCount|Int32|Number of android device count.|
|androidDedicatedCount|Int32|Number of dedicated Android devices.|
|androidDeviceAdminCount|Int32|Number of device admin Android devices.|
|androidFullyManagedCount|Int32|Number of fully managed Android devices.|
|androidWorkProfileCount|Int32|Number of work profile Android devices.|
|aospUserAssociatedCount|Int32|Number of AOSP user-associated Android devices. Valid values 0 to 2147483647|
|aospUserlessCount|Int32|Number of AOSP userless Android devices. Valid values 0 to 2147483647|
|configMgrDeviceCount|Int32|Number of ConfigMgr managed devices.|
|iosCount|Int32|Number of iOS device count.|
|linuxCount|Int32|Number of Linux OS devices. Valid values 0 to 2147483647|
|macOSCount|Int32|Number of Mac OS X device count.|
|unknownCount|Int32|Number of unknown device count.|
|windowsCount|Int32|Number of Windows device count.|
|windowsMobileCount|Int32|Number of Windows mobile device count.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceOperatingSystemSummary"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceOperatingSystemSummary",
  "androidCorporateWorkProfileCount": "Integer",
  "androidCount": "Integer",
  "androidDedicatedCount": "Integer",
  "androidDeviceAdminCount": "Integer",
  "androidFullyManagedCount": "Integer",
  "androidWorkProfileCount": "Integer",
  "aospUserAssociatedCount": "Integer",
  "aospUserlessCount": "Integer",
  "configMgrDeviceCount": "Integer",
  "iosCount": "Integer",
  "linuxCount": "Integer",
  "macOSCount": "Integer",
  "unknownCount": "Integer",
  "windowsCount": "Integer",
  "windowsMobileCount": "Integer"
}
```

