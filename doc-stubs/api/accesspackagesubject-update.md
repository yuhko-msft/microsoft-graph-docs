---
title: "Update accessPackageSubject"
description: "Update the properties of an accessPackageSubject object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update accessPackageSubject
Namespace: microsoft.graph



Update the properties of an [accessPackageSubject](../resources/accesspackagesubject.md) object.

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
PATCH /identityGovernance/entitlementManagement/accessPackageResourceRequests/{accessPackageResourceRequestId}/requestor
PATCH /identityGovernance/entitlementManagement/accessPackageAssignmentRequests/{accessPackageAssignmentRequestId}/requestor
PATCH /identityGovernance/entitlementManagement/accessPackageAssignmentRequests/{accessPackageAssignmentRequestId}/accessPackageAssignment/target
PATCH /identityGovernance/entitlementManagement/accessPackageAssignmentRequests/{accessPackageAssignmentRequestId}/accessPackageAssignment/accessPackageAssignmentResourceRoles/{accessPackageAssignmentResourceRoleId}/accessPackageSubject
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [accessPackageSubject](../resources/accesspackagesubject.md) object.

The following table shows the properties that are required when you update the [accessPackageSubject](../resources/accesspackagesubject.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|altSecId|String|**TODO: Add Description**|
|connectedOrganizationId|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|objectId|String|**TODO: Add Description**|
|onPremisesSecurityIdentifier|String|**TODO: Add Description**|
|principalName|String|**TODO: Add Description**|
|type|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [accessPackageSubject](../resources/accesspackagesubject.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_accesspackagesubject"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/identityGovernance/entitlementManagement/accessPackageResourceRequests/{accessPackageResourceRequestId}/requestor
Content-Type: application/json
Content-length: 298

{
  "@odata.type": "#microsoft.graph.accessPackageSubject",
  "altSecId": "String",
  "connectedOrganizationId": "String",
  "displayName": "String",
  "email": "String",
  "objectId": "String",
  "onPremisesSecurityIdentifier": "String",
  "principalName": "String",
  "type": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.accessPackageSubject",
  "id": "d5caa8aa-a8aa-d5ca-aaa8-cad5aaa8cad5",
  "altSecId": "String",
  "connectedOrganizationId": "String",
  "displayName": "String",
  "email": "String",
  "objectId": "String",
  "onPremisesSecurityIdentifier": "String",
  "principalName": "String",
  "type": "String"
}
```

