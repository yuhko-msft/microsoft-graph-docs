---
title: "complianceManagementPartner resource type"
description: "Compliance management partner for all platforms"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# complianceManagementPartner resource type

Namespace: microsoft.graph



Compliance management partner for all platforms


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List complianceManagementPartners](../api/compliancemanagementpartner-list.md)|[complianceManagementPartner](../resources/compliancemanagementpartner.md) collection|Get a list of the [complianceManagementPartner](../resources/compliancemanagementpartner.md) objects and their properties.|
|[Create complianceManagementPartner](../api/compliancemanagementpartner-create.md)|[complianceManagementPartner](../resources/compliancemanagementpartner.md)|Create a new [complianceManagementPartner](../resources/compliancemanagementpartner.md) object.|
|[Get complianceManagementPartner](../api/compliancemanagementpartner-get.md)|[complianceManagementPartner](../resources/compliancemanagementpartner.md)|Read the properties and relationships of a [complianceManagementPartner](../resources/compliancemanagementpartner.md) object.|
|[Update complianceManagementPartner](../api/compliancemanagementpartner-update.md)|[complianceManagementPartner](../resources/compliancemanagementpartner.md)|Update the properties of a [complianceManagementPartner](../resources/compliancemanagementpartner.md) object.|
|[Delete complianceManagementPartner](../api/compliancemanagementpartner-delete.md)|None|Deletes a [complianceManagementPartner](../resources/compliancemanagementpartner.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|androidEnrollmentAssignments|[complianceManagementPartnerAssignment](../resources/compliancemanagementpartnerassignment.md) collection|User groups which enroll Android devices through partner.|
|androidOnboarded|Boolean|Partner onboarded for Android devices.|
|displayName|String|Partner display name|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|iosEnrollmentAssignments|[complianceManagementPartnerAssignment](../resources/compliancemanagementpartnerassignment.md) collection|User groups which enroll ios devices through partner.|
|iosOnboarded|Boolean|Partner onboarded for ios devices.|
|lastHeartbeatDateTime|DateTimeOffset|Timestamp of last heartbeat after admin onboarded to the compliance management partner|
|macOsEnrollmentAssignments|[complianceManagementPartnerAssignment](../resources/compliancemanagementpartnerassignment.md) collection|User groups which enroll Mac devices through partner.|
|macOsOnboarded|Boolean|Partner onboarded for Mac devices.|
|partnerState|deviceManagementPartnerTenantState|Partner state of this tenant. Possible values are: `unknown`, `unavailable`, `enabled`, `terminated`, `rejected`, `unresponsive`.|
|windowsEnrollmentAssignments|[complianceManagementPartnerAssignment](../resources/compliancemanagementpartnerassignment.md) collection|User groups which enroll Windows devices through partner.|
|windowsOnboarded|Boolean|Partner onboarded for Windows devices.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.complianceManagementPartner",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.complianceManagementPartner",
  "id": "String (identifier)",
  "androidEnrollmentAssignments": [
    {
      "@odata.type": "microsoft.graph.complianceManagementPartnerAssignment"
    }
  ],
  "androidOnboarded": "Boolean",
  "displayName": "String",
  "iosEnrollmentAssignments": [
    {
      "@odata.type": "microsoft.graph.complianceManagementPartnerAssignment"
    }
  ],
  "iosOnboarded": "Boolean",
  "lastHeartbeatDateTime": "String (timestamp)",
  "macOsEnrollmentAssignments": [
    {
      "@odata.type": "microsoft.graph.complianceManagementPartnerAssignment"
    }
  ],
  "macOsOnboarded": "Boolean",
  "partnerState": "String",
  "windowsEnrollmentAssignments": [
    {
      "@odata.type": "microsoft.graph.complianceManagementPartnerAssignment"
    }
  ],
  "windowsOnboarded": "Boolean"
}
```

