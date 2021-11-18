---
title: "Create windowsInformationProtectionAppLearningSummary"
description: "Create a new windowsInformationProtectionAppLearningSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsInformationProtectionAppLearningSummary
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new windowsInformationProtectionAppLearningSummary object.

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
POST /deviceManagement/windowsInformationProtectionAppLearningSummaries
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsInformationProtectionAppLearningSummary](../resources/intune-windowsinformationprotectionapplearningsummary.md) object.

You can specify the following properties when creating a **windowsInformationProtectionAppLearningSummary**.

|Property|Type|Description|
|:---|:---|:---|
|applicationName|String|Application Name Optional.|
|applicationType|applicationType|Application Type. The possible values are: `universal`, `desktop`. Required.|
|deviceCount|Int32|Device Count Required.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsInformationProtectionAppLearningSummary](../resources/intune-windowsinformationprotectionapplearningsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsinformationprotectionapplearningsummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/windowsInformationProtectionAppLearningSummaries
Content-Type: application/json
Content-length: 199

{
  "@odata.type": "#microsoft.management.services.api.windowsInformationProtectionAppLearningSummary",
  "applicationName": "String",
  "applicationType": "String",
  "deviceCount": "Integer"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.windowsInformationProtectionAppLearningSummary"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.management.services.api.windowsInformationProtectionAppLearningSummary",
  "id": "fbe246f2-46f2-fbe2-f246-e2fbf246e2fb",
  "applicationName": "String",
  "applicationType": "String",
  "deviceCount": "Integer"
}
```

