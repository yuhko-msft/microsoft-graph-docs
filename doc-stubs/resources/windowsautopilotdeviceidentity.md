---
title: "windowsAutopilotDeviceIdentity resource type"
description: "The windowsAutopilotDeviceIdentity resource represents a Windows Autopilot Device."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsAutopilotDeviceIdentity resource type

Namespace: microsoft.graph



The windowsAutopilotDeviceIdentity resource represents a Windows Autopilot Device.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsAutopilotDeviceIdentities](../api/windowsautopilotdeviceidentity-list.md)|[windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md) collection|Get a list of the [windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md) objects and their properties.|
|[Create windowsAutopilotDeviceIdentity](../api/windowsautopilotdeviceidentity-create.md)|[windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md)|Create a new [windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md) object.|
|[Get windowsAutopilotDeviceIdentity](../api/windowsautopilotdeviceidentity-get.md)|[windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md)|Read the properties and relationships of a [windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md) object.|
|[Update windowsAutopilotDeviceIdentity](../api/windowsautopilotdeviceidentity-update.md)|[windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md)|Update the properties of a [windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md) object.|
|[Delete windowsAutopilotDeviceIdentity](../api/windowsautopilotdeviceidentity-delete.md)|None|Deletes a [windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md) object.|
|[assignResourceAccountToDevice](../api/windowsautopilotdeviceidentity-assignresourceaccounttodevice.md)|None|**TODO: Add Description**|
|[assignUserToDevice](../api/windowsautopilotdeviceidentity-assignusertodevice.md)|None|**TODO: Add Description**|
|[deleteDevices](../api/windowsautopilotdeviceidentity-deletedevices.md)|[deletedWindowsAutopilotDeviceState](../resources/deletedwindowsautopilotdevicestate.md) collection|**TODO: Add Description**|
|[unassignResourceAccountFromDevice](../api/windowsautopilotdeviceidentity-unassignresourceaccountfromdevice.md)|None|**TODO: Add Description**|
|[unassignUserFromDevice](../api/windowsautopilotdeviceidentity-unassignuserfromdevice.md)|None|**TODO: Add Description**|
|[updateDeviceProperties](../api/windowsautopilotdeviceidentity-updatedeviceproperties.md)|None|**TODO: Add Description**|
|[List windowsAutopilotDeploymentProfile](../api/windowsautopilotdeviceidentity-list-deploymentprofile.md)|[windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md) collection|Get the windowsAutopilotDeploymentProfile resources from the deploymentProfile navigation property.|
|[Add windowsAutopilotDeploymentProfile](../api/windowsautopilotdeviceidentity-post-deploymentprofile.md)|[windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|Add deploymentProfile by posting to the deploymentProfile collection.|
|[List windowsAutopilotDeploymentProfile](../api/windowsautopilotdeviceidentity-list-intendeddeploymentprofile.md)|[windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md) collection|Get the windowsAutopilotDeploymentProfile resources from the intendedDeploymentProfile navigation property.|
|[Add windowsAutopilotDeploymentProfile](../api/windowsautopilotdeviceidentity-post-intendeddeploymentprofile.md)|[windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|Add intendedDeploymentProfile by posting to the intendedDeploymentProfile collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|addressableUserName|String|Addressable user name.|
|azureActiveDirectoryDeviceId|String|AAD Device ID - to be deprecated|
|azureAdDeviceId|String|AAD Device ID|
|deploymentProfileAssignedDateTime|DateTimeOffset|Profile set time of the Windows autopilot device.|
|deploymentProfileAssignmentDetailedStatus|windowsAutopilotProfileAssignmentDetailedStatus|Profile assignment detailed status of the Windows autopilot device. Possible values are: `none`, `hardwareRequirementsNotMet`, `surfaceHubProfileNotSupported`, `holoLensProfileNotSupported`, `windowsPcProfileNotSupported`.|
|deploymentProfileAssignmentStatus|windowsAutopilotProfileAssignmentStatus|Profile assignment status of the Windows autopilot device. Possible values are: `unknown`, `assignedInSync`, `assignedOutOfSync`, `assignedUnkownSyncState`, `notAssigned`, `pending`, `failed`.|
|displayName|String|Display Name|
|enrollmentState|enrollmentState|Intune enrollment state of the Windows autopilot device. Possible values are: `unknown`, `enrolled`, `pendingReset`, `failed`, `notContacted`, `blocked`.|
|groupTag|String|Group Tag of the Windows autopilot device.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastContactedDateTime|DateTimeOffset|Intune Last Contacted Date Time of the Windows autopilot device.|
|managedDeviceId|String|Managed Device ID|
|manufacturer|String|Oem manufacturer of the Windows autopilot device.|
|model|String|Model name of the Windows autopilot device.|
|productKey|String|Product Key of the Windows autopilot device.|
|purchaseOrderIdentifier|String|Purchase Order Identifier of the Windows autopilot device.|
|resourceName|String|Resource Name.|
|serialNumber|String|Serial number of the Windows autopilot device.|
|skuNumber|String|SKU Number|
|systemFamily|String|System Family|
|userPrincipalName|String|User Principal Name.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|deploymentProfile|[windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|Deployment profile currently assigned to the Windows autopilot device.|
|intendedDeploymentProfile|[windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|Deployment profile intended to be assigned to the Windows autopilot device.|

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
  "addressableUserName": "String",
  "azureActiveDirectoryDeviceId": "String",
  "azureAdDeviceId": "String",
  "deploymentProfileAssignedDateTime": "String (timestamp)",
  "deploymentProfileAssignmentDetailedStatus": "String",
  "deploymentProfileAssignmentStatus": "String",
  "displayName": "String",
  "enrollmentState": "String",
  "groupTag": "String",
  "lastContactedDateTime": "String (timestamp)",
  "managedDeviceId": "String",
  "manufacturer": "String",
  "model": "String",
  "productKey": "String",
  "purchaseOrderIdentifier": "String",
  "resourceName": "String",
  "serialNumber": "String",
  "skuNumber": "String",
  "systemFamily": "String",
  "userPrincipalName": "String"
}
```

