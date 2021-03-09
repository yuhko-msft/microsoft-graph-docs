---
title: "windowsAutopilotDeviceIdentity resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsAutopilotDeviceIdentity resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsAutopilotDeviceIdentities](../api/intune-windowsautopilotdeviceidentity-list.md)|[windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md) collection|Get a list of the [windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md) objects and their properties.|
|[Create windowsAutopilotDeviceIdentity](../api/intune-windowsautopilotdeviceidentity-create.md)|[windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md)|Create a new [windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md) object.|
|[Get windowsAutopilotDeviceIdentity](../api/intune-windowsautopilotdeviceidentity-get.md)|[windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md)|Read the properties and relationships of a [windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md) object.|
|[Update windowsAutopilotDeviceIdentity](../api/intune-windowsautopilotdeviceidentity-update.md)|[windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md)|Update the properties of a [windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md) object.|
|[Delete windowsAutopilotDeviceIdentity](../api/intune-windowsautopilotdeviceidentity-delete.md)|None|Deletes a [windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md) object.|
|[deleteDevices](../api/intune-windowsautopilotdeviceidentity-deletedevices.md)|[deletedWindowsAutopilotDeviceState](../resources/intune-deletedwindowsautopilotdevicestate.md) collection|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|addressableUserName|String|**TODO: Add Description**|
|azureActiveDirectoryDeviceId|String|**TODO: Add Description**|
|azureAdDeviceId|String|**TODO: Add Description**|
|deploymentProfileAssignedDateTime|DateTimeOffset|**TODO: Add Description**|
|deploymentProfileAssignmentDetailedStatus|windowsAutopilotProfileAssignmentDetailedStatus|**TODO: Add Description**. Possible values are: `none`, `hardwareRequirementsNotMet`, `surfaceHubProfileNotSupported`, `holoLensProfileNotSupported`, `windowsPcProfileNotSupported`.|
|deploymentProfileAssignmentStatus|windowsAutopilotProfileAssignmentStatus|**TODO: Add Description**. Possible values are: `unknown`, `assignedInSync`, `assignedOutOfSync`, `assignedUnkownSyncState`, `notAssigned`, `pending`, `failed`.|
|displayName|String|**TODO: Add Description**|
|enrollmentState|enrollmentState|**TODO: Add Description**. Possible values are: `unknown`, `enrolled`, `pendingReset`, `failed`, `notContacted`, `blocked`.|
|groupTag|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastContactedDateTime|DateTimeOffset|**TODO: Add Description**|
|managedDeviceId|String|**TODO: Add Description**|
|manufacturer|String|**TODO: Add Description**|
|model|String|**TODO: Add Description**|
|productKey|String|**TODO: Add Description**|
|purchaseOrderIdentifier|String|**TODO: Add Description**|
|resourceName|String|**TODO: Add Description**|
|serialNumber|String|**TODO: Add Description**|
|skuNumber|String|**TODO: Add Description**|
|systemFamily|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|deploymentProfile|[windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|**TODO: Add Description**|
|intendedDeploymentProfile|[windowsAutopilotDeploymentProfile](../resources/intune-windowsautopilotdeploymentprofile.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsAutopilotDeviceIdentity",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsAutopilotDeviceIdentity",
  "id": "String (identifier)",
  "deploymentProfileAssignmentStatus": "String",
  "deploymentProfileAssignmentDetailedStatus": "String",
  "deploymentProfileAssignedDateTime": "String (timestamp)",
  "groupTag": "String",
  "purchaseOrderIdentifier": "String",
  "serialNumber": "String",
  "productKey": "String",
  "manufacturer": "String",
  "model": "String",
  "enrollmentState": "String",
  "lastContactedDateTime": "String (timestamp)",
  "addressableUserName": "String",
  "userPrincipalName": "String",
  "resourceName": "String",
  "skuNumber": "String",
  "systemFamily": "String",
  "azureActiveDirectoryDeviceId": "String",
  "azureAdDeviceId": "String",
  "managedDeviceId": "String",
  "displayName": "String"
}
```

