---
title: "iosVppAppAssignedDeviceLicense resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosVppAppAssignedDeviceLicense resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosVppAppAssignedDeviceLicenses](../api/iosvppappassigneddevicelicense-list.md)|[iosVppAppAssignedDeviceLicense](../resources/iosvppappassigneddevicelicense.md) collection|Get a list of the [iosVppAppAssignedDeviceLicense](../resources/iosvppappassigneddevicelicense.md) objects and their properties.|
|[Create iosVppAppAssignedDeviceLicense](../api/iosvppappassigneddevicelicense-create.md)|[iosVppAppAssignedDeviceLicense](../resources/iosvppappassigneddevicelicense.md)|Create a new [iosVppAppAssignedDeviceLicense](../resources/iosvppappassigneddevicelicense.md) object.|
|[Get iosVppAppAssignedDeviceLicense](../api/iosvppappassigneddevicelicense-get.md)|[iosVppAppAssignedDeviceLicense](../resources/iosvppappassigneddevicelicense.md)|Read the properties and relationships of an [iosVppAppAssignedDeviceLicense](../resources/iosvppappassigneddevicelicense.md) object.|
|[Update iosVppAppAssignedDeviceLicense](../api/iosvppappassigneddevicelicense-update.md)|[iosVppAppAssignedDeviceLicense](../resources/iosvppappassigneddevicelicense.md)|Update the properties of an [iosVppAppAssignedDeviceLicense](../resources/iosvppappassigneddevicelicense.md) object.|
|[Delete iosVppAppAssignedDeviceLicense](../api/iosvppappassigneddevicelicense-delete.md)|None|Deletes an [iosVppAppAssignedDeviceLicense](../resources/iosvppappassigneddevicelicense.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|managedDeviceId|String|**TODO: Add Description**|
|userEmailAddress|String|**TODO: Add Description** Inherited from [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|
|userId|String|**TODO: Add Description** Inherited from [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|
|userName|String|**TODO: Add Description** Inherited from [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|
|userPrincipalName|String|**TODO: Add Description** Inherited from [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.iosVppAppAssignedDeviceLicense",
  "baseType": "microsoft.graph.iosVppAppAssignedLicense",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosVppAppAssignedDeviceLicense",
  "id": "String (identifier)",
  "userEmailAddress": "String",
  "userId": "String",
  "userName": "String",
  "userPrincipalName": "String",
  "managedDeviceId": "String",
  "deviceName": "String"
}
```

