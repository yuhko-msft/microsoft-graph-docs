---
title: "comanagementEligibleDevice resource type"
description: "Device Co-Management eligibility state"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# comanagementEligibleDevice resource type

Namespace: microsoft.graph



Device Co-Management eligibility state


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List comanagementEligibleDevices](../api/comanagementeligibledevice-list.md)|[comanagementEligibleDevice](../resources/comanagementeligibledevice.md) collection|Get a list of the [comanagementEligibleDevice](../resources/comanagementeligibledevice.md) objects and their properties.|
|[Create comanagementEligibleDevice](../api/comanagementeligibledevice-create.md)|[comanagementEligibleDevice](../resources/comanagementeligibledevice.md)|Create a new [comanagementEligibleDevice](../resources/comanagementeligibledevice.md) object.|
|[Get comanagementEligibleDevice](../api/comanagementeligibledevice-get.md)|[comanagementEligibleDevice](../resources/comanagementeligibledevice.md)|Read the properties and relationships of a [comanagementEligibleDevice](../resources/comanagementeligibledevice.md) object.|
|[Update comanagementEligibleDevice](../api/comanagementeligibledevice-update.md)|[comanagementEligibleDevice](../resources/comanagementeligibledevice.md)|Update the properties of a [comanagementEligibleDevice](../resources/comanagementeligibledevice.md) object.|
|[Delete comanagementEligibleDevice](../api/comanagementeligibledevice-delete.md)|None|Deletes a [comanagementEligibleDevice](../resources/comanagementeligibledevice.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|clientRegistrationStatus|deviceRegistrationState|ClientRegistrationStatus. Possible values are: `notRegistered`, `registered`, `revoked`, `keyConflict`, `approvalPending`, `certificateReset`, `notRegisteredPendingEnrollment`, `unknown`.|
|deviceName|String|DeviceName|
|deviceType|deviceType|DeviceType. Possible values are: `desktop`, `windowsRT`, `winMO6`, `nokia`, `windowsPhone`, `mac`, `winCE`, `winEmbedded`, `iPhone`, `iPad`, `iPod`, `android`, `iSocConsumer`, `unix`, `macMDM`, `holoLens`, `surfaceHub`, `androidForWork`, `androidEnterprise`, `windows10x`, `androidnGMS`, `chromeOS`, `linux`, `blackberry`, `palm`, `unknown`, `cloudPC`.|
|entitySource|Int32|EntitySource|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|managementAgents|managementAgentType|ManagementAgents. Possible values are: `eas`, `mdm`, `easMdm`, `intuneClient`, `easIntuneClient`, `configurationManagerClient`, `configurationManagerClientMdm`, `configurationManagerClientMdmEas`, `unknown`, `jamf`, `googleCloudDevicePolicyController`, `microsoft365ManagedMdm`, `windowsManagementCloudApi`.|
|managementState|managementState|ManagementState. Possible values are: `managed`, `retirePending`, `retireFailed`, `wipePending`, `wipeFailed`, `unhealthy`, `deletePending`, `retireIssued`, `wipeIssued`, `wipeCanceled`, `retireCanceled`, `discovered`.|
|manufacturer|String|Manufacturer|
|mdmStatus|String|MDMStatus|
|model|String|Model|
|osDescription|String|OSDescription|
|osVersion|String|OSVersion|
|ownerType|ownerType|OwnerType. Possible values are: `unknown`, `company`, `personal`.|
|referenceId|String|ReferenceId|
|serialNumber|String|SerialNumber|
|status|comanagementEligibleType|ComanagementEligibleStatus. Possible values are: `comanaged`, `eligible`, `eligibleButNotAzureAdJoined`, `needsOsUpdate`, `ineligible`.|
|upn|String|UPN|
|userEmail|String|UserEmail|
|userId|String|UserId|
|userName|String|UserName|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.comanagementEligibleDevice",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.comanagementEligibleDevice",
  "id": "String (identifier)",
  "clientRegistrationStatus": "String",
  "deviceName": "String",
  "deviceType": "String",
  "entitySource": "Integer",
  "managementAgents": "String",
  "managementState": "String",
  "manufacturer": "String",
  "mdmStatus": "String",
  "model": "String",
  "osDescription": "String",
  "osVersion": "String",
  "ownerType": "String",
  "referenceId": "String",
  "serialNumber": "String",
  "status": "String",
  "upn": "String",
  "userEmail": "String",
  "userId": "String",
  "userName": "String"
}
```

