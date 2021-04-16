---
title: "Create windowsDefenderApplicationControlSupplementalPolicy"
description: "Create a new windowsDefenderApplicationControlSupplementalPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsDefenderApplicationControlSupplementalPolicy
Namespace: microsoft.graph



Create a new [windowsDefenderApplicationControlSupplementalPolicy](../resources/windowsdefenderapplicationcontrolsupplementalpolicy.md) object.

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
POST /deviceAppManagement/wdacSupplementalPolicies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsDefenderApplicationControlSupplementalPolicy](../resources/windowsdefenderapplicationcontrolsupplementalpolicy.md) object.

The following table shows the properties that are required when you create the [windowsDefenderApplicationControlSupplementalPolicy](../resources/windowsdefenderapplicationcontrolsupplementalpolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|content|Binary|The WindowsDefenderApplicationControl supplemental policy content in byte array format.|
|contentFileName|String|The WindowsDefenderApplicationControl supplemental policy content's file name.|
|creationDateTime|DateTimeOffset|The date and time when the WindowsDefenderApplicationControl supplemental policy was uploaded.|
|description|String|The description of WindowsDefenderApplicationControl supplemental policy.|
|displayName|String|The display name of WindowsDefenderApplicationControl supplemental policy.|
|lastModifiedDateTime|DateTimeOffset|The date and time when the WindowsDefenderApplicationControl supplemental policy was last modified.|
|roleScopeTagIds|String collection|List of Scope Tags for this WindowsDefenderApplicationControl supplemental policy entity.|
|version|String|The WindowsDefenderApplicationControl supplemental policy's version.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsDefenderApplicationControlSupplementalPolicy](../resources/windowsdefenderapplicationcontrolsupplementalpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsdefenderapplicationcontrolsupplementalpolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceAppManagement/wdacSupplementalPolicies
Content-Type: application/json
Content-length: 318

{
  "@odata.type": "#microsoft.graph.windowsDefenderApplicationControlSupplementalPolicy",
  "content": "Binary",
  "contentFileName": "String",
  "creationDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsDefenderApplicationControlSupplementalPolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsDefenderApplicationControlSupplementalPolicy",
  "id": "5a79b310-b310-5a79-10b3-795a10b3795a",
  "content": "Binary",
  "contentFileName": "String",
  "creationDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "String"
}
```

