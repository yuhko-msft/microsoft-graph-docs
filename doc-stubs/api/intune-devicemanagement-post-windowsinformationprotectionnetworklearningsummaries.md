---
title: "Create windowsInformationProtectionNetworkLearningSummary"
description: "Create a new windowsInformationProtectionNetworkLearningSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsInformationProtectionNetworkLearningSummary
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new windowsInformationProtectionNetworkLearningSummary object.

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
POST /deviceManagement/windowsInformationProtectionNetworkLearningSummaries
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsInformationProtectionNetworkLearningSummary](../resources/intune-windowsinformationprotectionnetworklearningsummary.md) object.

You can specify the following properties when creating a **windowsInformationProtectionNetworkLearningSummary**.

|Property|Type|Description|
|:---|:---|:---|
|url|String|Website url Optional.|
|deviceCount|Int32|Device Count Required.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsInformationProtectionNetworkLearningSummary](../resources/intune-windowsinformationprotectionnetworklearningsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsinformationprotectionnetworklearningsummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/windowsInformationProtectionNetworkLearningSummaries
Content-Type: application/json
Content-length: 159

{
  "@odata.type": "#microsoft.management.services.api.windowsInformationProtectionNetworkLearningSummary",
  "url": "String",
  "deviceCount": "Integer"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.windowsInformationProtectionNetworkLearningSummary"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.management.services.api.windowsInformationProtectionNetworkLearningSummary",
  "id": "6ab42c85-2c85-6ab4-852c-b46a852cb46a",
  "url": "String",
  "deviceCount": "Integer"
}
```

