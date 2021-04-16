---
title: "Create governanceSubject"
description: "Create a new governanceSubject object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create governanceSubject
Namespace: microsoft.graph



Create a new [governanceSubject](../resources/governancesubject.md) object.

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
POST /governanceSubjects
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [governanceSubject](../resources/governancesubject.md) object.

The following table shows the properties that are required when you create the [governanceSubject](../resources/governancesubject.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|principalName|String|**TODO: Add Description**|
|type|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [governanceSubject](../resources/governancesubject.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_governancesubject_from_governancesubjects"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/governanceSubjects
Content-Type: application/json
Content-length: 160

{
  "@odata.type": "#microsoft.graph.governanceSubject",
  "displayName": "String",
  "email": "String",
  "principalName": "String",
  "type": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.governanceSubject"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.governanceSubject",
  "id": "3f87f187-f187-3f87-87f1-873f87f1873f",
  "displayName": "String",
  "email": "String",
  "principalName": "String",
  "type": "String"
}
```

