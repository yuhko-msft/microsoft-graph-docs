---
title: "azureADDevice resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# azureADDevice resource type

Namespace: microsoft.graph.windowsUpdates

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A device in Azure Active Directory that is registered with the deployment service.


Inherits from [updatableAsset](../resources/windowsupdates-updatableasset.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List azureADDevices](../api/windowsupdates-azureaddevice-list.md)|[azureADDevice](../resources/windowsupdates-azureaddevice.md) collection|Get a list of the [azureADDevice](../resources/azureaddevice.md) objects and their properties.|
|[Create azureADDevice](../api/windowsupdates-azureaddevice-create.md)|[azureADDevice](../resources/windowsupdates-azureaddevice.md)|Create a new [azureADDevice](../resources/windowsupdates-azureaddevice.md) object.|
|[Get azureADDevice](../api/windowsupdates-azureaddevice-get.md)|[azureADDevice](../resources/windowsupdates-azureaddevice.md)|Read the properties and relationships of an [azureADDevice](../resources/windowsupdates-azureaddevice.md) object.|
|[Delete azureADDevice](../api/windowsupdates-azureaddevice-delete.md)|None|Deletes an [azureADDevice](../resources/windowsupdates-azureaddevice.md) object.|
|[Enroll azureADDevice in management](../api/windowsupdates-updatableasset-enrollassets.md)|None|Enroll the device in update management by the deployment service.|
|[Unenroll azureADDevice from management](../api/windowsupdates-updatableasset-unenrollassets.md)|None|Unenroll the device from update management by the deployment service.|


## Properties
|Property|Type|Description|
|:---|:---|:---|
|enrollments|[updatableAssetEnrollment](../resources/windowsupdates-updatableassetenrollment.md) collection|Specifies areas of the service in which the device is enrolled. Read-only. Returned by default.|
|errors|[updatableAssetError](../resources/windowsupdates-updatableasseterror.md) collection|Specifies any errors that prevent the device from being enrolled in update management or receving deployed content. Read-only. Returned by default.|
|id|String|An identifier for the device. Key. Not nullable. Read-only. Returned by default. Inherited from [updatableAsset](../resources/windowsupdates-updatableasset.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsUpdates.azureADDevice",
  "baseType": "microsoft.graph.windowsUpdates.updatableAsset",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUpdates.azureADDevice",
  "id": "String (identifier)",
  "errors": [
    {
      "@odata.type": "microsoft.graph.windowsUpdates.azureADDeviceRegistrationError"
    }
  ],
  "enrollments": [
    {
      "@odata.type": "microsoft.graph.windowsUpdates.updateManagementEnrollment"
    }
  ]
}
```

