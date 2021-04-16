---
title: "Create connectedOrganization"
description: "Create a new connectedOrganization object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create connectedOrganization
Namespace: microsoft.graph



Create a new [connectedOrganization](../resources/connectedorganization.md) object.

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
POST /identityGovernance/entitlementManagement/connectedOrganizations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [connectedOrganization](../resources/connectedorganization.md) object.

The following table shows the properties that are required when you create the [connectedOrganization](../resources/connectedorganization.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdBy|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|identitySources|[identitySource](../resources/identitysource.md) collection|**TODO: Add Description**|
|modifiedBy|String|**TODO: Add Description**|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|state|connectedOrganizationState|**TODO: Add Description**. Possible values are: `configured`, `proposed`, `unknownFutureValue`.|



## Response

If successful, this method returns a `201 Created` response code and a [connectedOrganization](../resources/connectedorganization.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_connectedorganization_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/identityGovernance/entitlementManagement/connectedOrganizations
Content-Type: application/json
Content-length: 305

{
  "@odata.type": "#microsoft.graph.connectedOrganization",
  "createdBy": "String",
  "description": "String",
  "displayName": "String",
  "identitySources": [
    {
      "@odata.type": "microsoft.graph.azureActiveDirectoryTenant"
    }
  ],
  "modifiedBy": "String",
  "state": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.connectedOrganization"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.connectedOrganization",
  "id": "d983c5d0-c5d0-d983-d0c5-83d9d0c583d9",
  "createdBy": "String",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "identitySources": [
    {
      "@odata.type": "microsoft.graph.azureActiveDirectoryTenant"
    }
  ],
  "modifiedBy": "String",
  "modifiedDateTime": "String (timestamp)",
  "state": "String"
}
```

