---
title: "Create internalSponsors"
description: "Create a new directoryObject object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create internalSponsors
Namespace: microsoft.graph



Create a new directoryObject object.

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
POST /identityGovernance/entitlementManagement/accessPackageAssignmentRequests/{accessPackageAssignmentRequestId}/accessPackageAssignment/accessPackageAssignmentResourceRoles/{accessPackageAssignmentResourceRoleId}/accessPackageSubject/connectedOrganization/internalSponsors
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [directoryObject](../resources/directoryobject.md) object.

The following table shows the properties that are required when you create the [directoryObject](../resources/directoryobject.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deletedDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [directoryObject](../resources/directoryobject.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_directoryobject_from_directoryobjects"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/identityGovernance/entitlementManagement/accessPackageAssignmentRequests/{accessPackageAssignmentRequestId}/accessPackageAssignment/accessPackageAssignmentResourceRoles/{accessPackageAssignmentResourceRoleId}/accessPackageSubject/connectedOrganization/internalSponsors
Content-Type: application/json
Content-length: 101

{
  "@odata.type": "#microsoft.graph.directoryObject",
  "deletedDateTime": "String (timestamp)"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.directoryObject"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.directoryObject",
  "id": "8f7e2d7a-2d7a-8f7e-7a2d-7e8f7a2d7e8f",
  "deletedDateTime": "String (timestamp)"
}
```

