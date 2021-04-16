---
title: "Update groupPolicyPresentationListBox"
description: "Update the properties of a groupPolicyPresentationListBox object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update groupPolicyPresentationListBox
Namespace: microsoft.graph



Update the properties of a [groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md) object.

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
PATCH ** Entity URI for microsoft.graph.groupPolicyPresentationListBox not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md) object.

The following table shows the properties that are required when you update the [groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|Localized text label for any presentation entity. The default value is empty. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified. Inherited from [groupPolicyPresentation](../resources/grouppolicypresentation.md)|
|explicitValue|Boolean|If this option is specified true the user must specify the registry subkey value and the registry subkey name. The list box shows two columns, one for the name and one for the data. The default value is false.|
|valuePrefix|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [groupPolicyPresentationListBox](../resources/grouppolicypresentationlistbox.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_grouppolicypresentationlistbox"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.groupPolicyPresentationListBox not found
Content-Type: application/json
Content-length: 153

{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationListBox",
  "label": "String",
  "explicitValue": "Boolean",
  "valuePrefix": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationListBox",
  "id": "58832a5f-2a5f-5883-5f2a-83585f2a8358",
  "label": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "explicitValue": "Boolean",
  "valuePrefix": "String"
}
```

