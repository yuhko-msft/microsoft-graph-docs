---
title: "Get iosLobAppProvisioningConfigurationPolicySetItem"
description: "Read the properties and relationships of an iosLobAppProvisioningConfigurationPolicySetItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get iosLobAppProvisioningConfigurationPolicySetItem
Namespace: microsoft.graph

Read the properties and relationships of an [iosLobAppProvisioningConfigurationPolicySetItem](../resources/intune-ioslobappprovisioningconfigurationpolicysetitem.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET /iosLobAppProvisioningConfigurationPolicySetItem
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

If successful, this method returns a `200 OK` response code and an [iosLobAppProvisioningConfigurationPolicySetItem](../resources/intune-ioslobappprovisioningconfigurationpolicysetitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_ioslobappprovisioningconfigurationpolicysetitem"
}
-->
``` http
GET https://graph.microsoft.com/beta/iosLobAppProvisioningConfigurationPolicySetItem
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosLobAppProvisioningConfigurationPolicySetItem"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.iosLobAppProvisioningConfigurationPolicySetItem",
    "id": "a440b6cd-b6cd-a440-cdb6-40a4cdb640a4",
    "createdDateTime": "String (timestamp)",
    "lastModifiedDateTime": "String (timestamp)",
    "payloadId": "String",
    "itemType": "String",
    "displayName": "String",
    "status": "String",
    "errorCode": "String",
    "guidedDeploymentTags": [
      "String"
    ]
  }
}
```

