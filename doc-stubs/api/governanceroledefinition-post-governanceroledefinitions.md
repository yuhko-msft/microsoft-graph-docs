---
title: "Create governanceRoleDefinition"
description: "Create a new governanceRoleDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create governanceRoleDefinition
Namespace: microsoft.graph



Create a new [governanceRoleDefinition](../resources/governanceroledefinition.md) object.

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
POST /governanceRoleDefinitions
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [governanceRoleDefinition](../resources/governanceroledefinition.md) object.

The following table shows the properties that are required when you create the [governanceRoleDefinition](../resources/governanceroledefinition.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|externalId|String|**TODO: Add Description**|
|resourceId|String|**TODO: Add Description**|
|templateId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [governanceRoleDefinition](../resources/governanceroledefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_governanceroledefinition_from_governanceroledefinitions"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/governanceRoleDefinitions
Content-Type: application/json
Content-length: 175

{
  "@odata.type": "#microsoft.graph.governanceRoleDefinition",
  "displayName": "String",
  "externalId": "String",
  "resourceId": "String",
  "templateId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.governanceRoleDefinition"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.governanceRoleDefinition",
  "id": "e11e1e2a-1e2a-e11e-2a1e-1ee12a1e1ee1",
  "displayName": "String",
  "externalId": "String",
  "resourceId": "String",
  "templateId": "String"
}
```

