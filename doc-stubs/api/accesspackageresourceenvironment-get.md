---
title: "Get accessPackageResourceEnvironment"
description: "Read the properties and relationships of an accessPackageResourceEnvironment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get accessPackageResourceEnvironment
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of an [accessPackageResourceEnvironment](../resources/accesspackageresourceenvironment.md) object.

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
GET /accessPackageResources/{accessPackageResourcesId}/accessPackageResourceEnvironment
GET /entitlementManagement/accessPackageResourceEnvironments/{accessPackageResourceEnvironmentId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and an [accessPackageResourceEnvironment](../resources/accesspackageresourceenvironment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_accesspackageresourceenvironment"
}
-->
``` http
GET https://graph.microsoft.com/beta/accessPackageResources/{accessPackageResourcesId}/accessPackageResourceEnvironment
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.IGAELM.EC.FrontEnd.ExternalModel.accessPackageResourceEnvironment"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#Microsoft.IGAELM.EC.FrontEnd.ExternalModel.accessPackageResourceEnvironment",
    "connectionInfo": {
      "@odata.type": "microsoft.graph.connectionInfo"
    },
    "createdBy": "String",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "displayName": "String",
    "id": "80c062ad-62ad-80c0-ad62-c080ad62c080",
    "isDefaultEnvironment": "Boolean",
    "modifiedBy": "String",
    "modifiedDateTime": "String (timestamp)",
    "originId": "String",
    "originSystem": "String"
  }
}
```

