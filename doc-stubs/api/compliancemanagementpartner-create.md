---
title: "Create complianceManagementPartner"
description: "Create a new complianceManagementPartner object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create complianceManagementPartner
Namespace: microsoft.graph



Create a new [complianceManagementPartner](../resources/compliancemanagementpartner.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /deviceManagement/complianceManagementPartners
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [complianceManagementPartner](../resources/compliancemanagementpartner.md) object.

The following table shows the properties that are required when you create the [complianceManagementPartner](../resources/compliancemanagementpartner.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|androidEnrollmentAssignments|[complianceManagementPartnerAssignment](../resources/compliancemanagementpartnerassignment.md) collection|User groups which enroll Android devices through partner.|
|androidOnboarded|Boolean|Partner onboarded for Android devices.|
|displayName|String|Partner display name|
|iosEnrollmentAssignments|[complianceManagementPartnerAssignment](../resources/compliancemanagementpartnerassignment.md) collection|User groups which enroll ios devices through partner.|
|iosOnboarded|Boolean|Partner onboarded for ios devices.|
|lastHeartbeatDateTime|DateTimeOffset|Timestamp of last heartbeat after admin onboarded to the compliance management partner|
|macOsEnrollmentAssignments|[complianceManagementPartnerAssignment](../resources/compliancemanagementpartnerassignment.md) collection|User groups which enroll Mac devices through partner.|
|macOsOnboarded|Boolean|Partner onboarded for Mac devices.|
|partnerState|deviceManagementPartnerTenantState|Partner state of this tenant. Possible values are: `unknown`, `unavailable`, `enabled`, `terminated`, `rejected`, `unresponsive`.|
|windowsEnrollmentAssignments|[complianceManagementPartnerAssignment](../resources/compliancemanagementpartnerassignment.md) collection|User groups which enroll Windows devices through partner.|
|windowsOnboarded|Boolean|Partner onboarded for Windows devices.|



## Response

If successful, this method returns a `201 Created` response code and a [complianceManagementPartner](../resources/compliancemanagementpartner.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_compliancemanagementpartner_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/complianceManagementPartners
Content-Type: application/json
Content-length: 840

{
  "@odata.type": "#microsoft.graph.complianceManagementPartner",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.complianceManagementPartner"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.complianceManagementPartner",
  "id": "9c8c39e8-39e8-9c8c-e839-8c9ce8398c9c",
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

