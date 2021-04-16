---
title: "List depOnboardingSettings"
description: "Get a list of the depOnboardingSetting objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List depOnboardingSettings
Namespace: microsoft.graph



Get a list of the [depOnboardingSetting](../resources/deponboardingsetting.md) objects and their properties.

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
GET /deviceManagement/depOnboardingSettings
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

If successful, this method returns a `200 OK` response code and a collection of [depOnboardingSetting](../resources/deponboardingsetting.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_deponboardingsetting"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/depOnboardingSettings
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.depOnboardingSetting)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.depOnboardingSetting",
      "id": "428671b4-71b4-4286-b471-8642b4718642",
      "appleIdentifier": "String",
      "dataSharingConsentGranted": "Boolean",
      "lastModifiedDateTime": "String (timestamp)",
      "lastSuccessfulSyncDateTime": "String (timestamp)",
      "lastSyncErrorCode": "Integer",
      "lastSyncTriggeredDateTime": "String (timestamp)",
      "roleScopeTagIds": [
        "String"
      ],
      "shareTokenWithSchoolDataSyncService": "Boolean",
      "syncedDeviceCount": "Integer",
      "tokenExpirationDateTime": "String (timestamp)",
      "tokenName": "String",
      "tokenType": "String"
    }
  ]
}
```

