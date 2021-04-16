---
title: "Update regionalAndLanguageSettings"
description: "Update the properties of a regionalAndLanguageSettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update regionalAndLanguageSettings
Namespace: microsoft.graph



Update the properties of a [regionalAndLanguageSettings](../resources/regionalandlanguagesettings.md) object.

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
PATCH /me/settings/regionalAndLanguageSettings
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [regionalAndLanguageSettings](../resources/regionalandlanguagesettings.md) object.

The following table shows the properties that are required when you update the [regionalAndLanguageSettings](../resources/regionalandlanguagesettings.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|authoringLanguages|[localeInfo](../resources/localeinfo.md) collection|**TODO: Add Description**|
|defaultDisplayLanguage|[localeInfo](../resources/localeinfo.md)|**TODO: Add Description**|
|defaultRegionalFormat|[localeInfo](../resources/localeinfo.md)|**TODO: Add Description**|
|defaultSpeechInputLanguage|[localeInfo](../resources/localeinfo.md)|**TODO: Add Description**|
|defaultTranslationLanguage|[localeInfo](../resources/localeinfo.md)|**TODO: Add Description**|
|regionalFormatOverrides|[regionalFormatOverrides](../resources/regionalformatoverrides.md)|**TODO: Add Description**|
|translationPreferences|[translationPreferences](../resources/translationpreferences.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [regionalAndLanguageSettings](../resources/regionalandlanguagesettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_regionalandlanguagesettings"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/settings/regionalAndLanguageSettings
Content-Type: application/json
Content-length: 716

{
  "@odata.type": "#microsoft.graph.regionalAndLanguageSettings",
  "authoringLanguages": [
    {
      "@odata.type": "microsoft.graph.localeInfo"
    }
  ],
  "defaultDisplayLanguage": {
    "@odata.type": "microsoft.graph.localeInfo"
  },
  "defaultRegionalFormat": {
    "@odata.type": "microsoft.graph.localeInfo"
  },
  "defaultSpeechInputLanguage": {
    "@odata.type": "microsoft.graph.localeInfo"
  },
  "defaultTranslationLanguage": {
    "@odata.type": "microsoft.graph.localeInfo"
  },
  "regionalFormatOverrides": {
    "@odata.type": "microsoft.graph.regionalFormatOverrides"
  },
  "translationPreferences": {
    "@odata.type": "microsoft.graph.translationPreferences"
  }
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
  "@odata.type": "#microsoft.graph.regionalAndLanguageSettings",
  "id": "df2e8dd8-8dd8-df2e-d88d-2edfd88d2edf",
  "authoringLanguages": [
    {
      "@odata.type": "microsoft.graph.localeInfo"
    }
  ],
  "defaultDisplayLanguage": {
    "@odata.type": "microsoft.graph.localeInfo"
  },
  "defaultRegionalFormat": {
    "@odata.type": "microsoft.graph.localeInfo"
  },
  "defaultSpeechInputLanguage": {
    "@odata.type": "microsoft.graph.localeInfo"
  },
  "defaultTranslationLanguage": {
    "@odata.type": "microsoft.graph.localeInfo"
  },
  "regionalFormatOverrides": {
    "@odata.type": "microsoft.graph.regionalFormatOverrides"
  },
  "translationPreferences": {
    "@odata.type": "microsoft.graph.translationPreferences"
  }
}
```

